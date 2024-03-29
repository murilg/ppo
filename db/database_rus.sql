create type "Разрешение" as enum (
	'Редактор',
	'Читатель'
);

create table "Пользователь" (
	"Код пользователя" integer primary key generated by default as identity,
	"Логин" text not null,
	"Пароль" text not null,
	"Права" "Разрешение" not null
);

create table "Продавец" (
	"Код продавца" integer primary key generated by default as identity,
	"Код пользователя" integer references "Пользователь" ("Код пользователя"),
	"Фамилия" text not null,
	"Имя" text not null,
	"Отчество" text,
	"Номер телефона" text not null,
	"E-mail" text,
	"Должность" text
);

create table "Покупатель" (
	"Код покупателя" integer primary key generated by default as identity,
	"Код пользователя" integer references "Пользователь" ("Код пользователя"),
	"Фамилия" text not null,
	"Имя" text not null,
	"Номер телефона" text not null,
	"E-mail" text,
	"Город" text,
	"Улица" text,
	"Здание" text,
	"Квартира" smallint
);

create type "Категория" as enum (
	'Процессор',
	'Видеокарта',
	'Материнская плата',
	'Оперативная память',
	'Твердотельный накопитель',
	'Жёсткий диск',
	'Блок питания',
	'Компьютерный корпус',
	'Кулер для процессора'
);

create table "Товар" (
	"Код товара" integer primary key generated by default as identity, -- он же атрибут/артикул
	"Название" text not null,
	"Описание" text,
	"Характеристики" text,
	"Категория" "Категория",
	"Цена" float,
	"Количество" smallint
);

create type "Доставка" as enum (
	'Самовывоз',
	'Курьером'
);

create table "Заказ" (
	"Код заказа" integer primary key generated by default as identity,
	"Код покупателя" integer references "Покупатель" ("Код покупателя"),
	"Способ доставки" "Доставка" -- (самовывоз/курьером)
);

create table "Буфер" (
	"Код буфера" integer primary key generated by default as identity,
	"Код заказа" integer references "Заказ" ("Код заказа"),
	"Код товара" integer references "Товар" ("Код товара"),
	"Количество" smallint
);
