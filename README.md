# Итоговая контрольная работа
## Информация о проекте
Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные.
## Задание
1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
![изображение 1](https://github.com/AnnMitrakhovich/FinalWork_Linux/blob/main/Linux_1.png)
2. Создать директорию, переместить файл туда.
![изображение 2](https://github.com/AnnMitrakhovich/FinalWork_Linux/blob/main/Linux_2.png).
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
Скачиваем установочный файл mysql https://dev.mysql.com/get/mysql-apt-config_0.8.30-1_all.deb
![image](https://github.com/AnnMitrakhovich/FinalWork_Linux/blob/main/Linux_3.png).
Переходим в папку Загрузки: cd Downloads и устанавливаем компоненты mysql: sudo dpkg -i mysql-apt-config_0.8.30-1_all.deb
В процессе установки жмем Ок, чтобы выполнить полную установку.
![image](https://github.com/AnnMitrakhovich/FinalWork_Linux/blob/main/Linux_4.png).
Проверяем результат установки: systemctl status mysql
![image](https://github.com/AnnMitrakhovich/FinalWork_Linux/blob/main/Linux_5.png).
4. Установить и удалить deb-пакет с помощью dpkg.
![image](https://github.com/AnnMitrakhovich/FinalWork_Linux/blob/main/Linux_6.png).
5. Выложить историю команд в терминале ubuntu
Для получения истории введенных команд в терминале ubuntu используем: history
![image](https://github.com/AnnMitrakhovich/FinalWork_Linux/blob/main/Linux_7.png).
![image](https://github.com/AnnMitrakhovich/FinalWork_Linux/blob/main/Linux_8.png).
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: лошади, верблюды и ослы).
![diagram](https://github.com/AnnMitrakhovich/FinalWork_Linux/blob/main/diagram.pdf).
7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”. Для создания новой базы данных используется команда: ```CREATE DATABASE `human_friends` ```
8. Создать таблицы с иерархией из диаграммы в БД
   
```
CREATE TABLE Animals (
id_animal INT PRIMARY KEY AUTO_INCREMENT,
kind_of_animal VARCHAR(50),
name_of_animal VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS cat (
id INT PRIMARY KEY AUTO_INCREMENT,
id_kind_of_animal INT,
animal_name CHAR(30),
commands TEXT,
date_of_birth DATE,
FOREIGN KEY (id_kind_of_animal) REFERENCES Animals(id_animal)
ON DELETE SET NULL
ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS dog (
id INT PRIMARY KEY AUTO_INCREMENT,
id_kind_of_animal INT,
animal_name CHAR(30),
commands TEXT,
date_of_birth DATE,
FOREIGN KEY (id_kind_of_animal) REFERENCES Animals(id_animal)
ON DELETE SET NULL
ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS hamster (
id INT PRIMARY KEY AUTO_INCREMENT,
id_kind_of_animal INT,
animal_name CHAR(30),
commands TEXT,
date_of_birth DATE,
FOREIGN KEY (id_kind_of_animal) REFERENCES Animals(id_animal)
ON DELETE SET NULL
ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS horse (
id INT PRIMARY KEY AUTO_INCREMENT,
id_kind_of_animal INT,
animal_name CHAR(30),
commands TEXT,
date_of_birth DATE,
FOREIGN KEY (id_kind_of_animal) REFERENCES Animals(id_animal)
ON DELETE SET NULL
ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS camel (
id INT PRIMARY KEY AUTO_INCREMENT,
id_kind_of_animal INT,
animal_name CHAR(30),
commands TEXT,
date_of_birth DATE,
FOREIGN KEY (id_kind_of_animal) REFERENCES Animals(id_animal)
ON DELETE SET NULL
ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS donkey (
id INT PRIMARY KEY AUTO_INCREMENT,
id_kind_of_animal INT,
animal_name CHAR(30),
commands TEXT,
date_of_birth DATE,
FOREIGN KEY (id_kind_of_animal) REFERENCES Animals(id_animal)
ON DELETE SET NULL
ON UPDATE CASCADE
);
   ```

9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения
    
```
INSERT INTO Animals(kind_of_animal, name_of_animal) VALUES 
('pet', 'cat'), ('pet', 'dog'), ('pet', 'hamster'), 
('pack animal', 'horse'), ('pack animal', 'camel'), ('pack animal', 'donkey');

INSERT INTO cat (id_kind_of_animal, animal_name,commands, date_of_birth) VALUES 
(1, 'barsik', 'место, спать', '2021-01-01'),
(1, 'vasiliy', 'место, кушать', '2023-12-10'),
(1, 'mursik', 'место, кушать', '2024-02-02'),
(1, 'dir', 'место, кушать, спать', '2023-03-03'),
(1, 'krosh', 'место', '2024-05-05');
   
INSERT INTO dog (id_kind_of_animal, animal_name,commands, date_of_birth) VALUES 
(2, 'wolf', 'место, лежать, стоять, голос', '2022-01-01'),
(2, 'ralf', 'место, лежать, стоять, голос, рядом', '2019-12-10'),
(2, 'bucks', 'место, лежать, стоять, голос, ждать', '2024-02-02'),
(2, 'arnold', 'место, лежать, стоять, голос', '2022-03-03'),
(2, 'bim', 'место, лежать, стоять, голос, ждать', '2021-05-05');
    
INSERT INTO hamster (id_kind_of_animal, animal_name,commands, date_of_birth) VALUES 
(3, 'crack', 'спать', '2024-01-01'),
(3, 'chip', 'спать', '2023-12-10'),
(3, 'deil', 'спать', '2024-02-02'),
(3, 'hrum', '', '2024-03-03'),
(3, 'black', '', '2024-05-05');
    
INSERT INTO horse (id_kind_of_animal, animal_name,commands, date_of_birth) VALUES 
(4, 'igogo', 'галоп', '2021-01-01'),
(4, 'ada', 'прыжок, галоп', '2019-12-10'),
(4, 'yohoo', 'прыжок', '2020-02-02'),
(4, 'black', 'место', '2022-03-03'),
(4, 'white', 'галоп', '2018-05-05');
    
INSERT INTO camel (id_kind_of_animal, animal_name,commands, date_of_birth) VALUES 
(5, 'sam', 'вперед, вниз', '2023-01-05'),
(5, 'mel', 'вперед, вниз', '2019-12-14'),
(5, 'jack', '', '2024-05-02'),
(5, 'yoda', 'вперед, вниз', '2022-05-03'),
(5, 'vasya', 'вперед, вниз', '2018-05-05');
    
INSERT INTO donkey (id_kind_of_animal, animal_name,commands, date_of_birth) VALUES 
(6, 'ia', 'вперед, стой', '2023-01-05'),
(6, 'ira', 'вперед, стой', '2019-12-14'),
(6, 'yo', '', '2024-05-02'),
(6, 'red', 'вперед, стой', '2022-05-03'),
(6, 'kuzya', 'вперед, стой', '2018-05-05');
```

10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

```
DELETE FROM `human_friends`.`animals` WHERE (`id_animal` = '5');
DROP TABLE IF EXISTS camel;

INSERT INTO horse (id_kind_of_animal, animal_name, commands, date_of_birth)
SELECT id_kind_of_animal, animal_name, commands, date_of_birth
FROM donkey;

DROP TABLE donkey;

RENAME TABLE horse TO horse_donkey;
```
11.Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, 
но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице

```
CREATE TABLE young_animals (
id_of_young_animal INT PRIMARY KEY AUTO_INCREMENT,
animal_type VARCHAR(30),
animal_name VARCHAR(30),
date_of_birth DATE,
age_month INT
);

DROP FUNCTION IF EXISTS age_animal;
DELIMITER $$
CREATE FUNCTION age_animal (date_of_birth DATE)
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE result INT DEFAULT 0;
	SET result = TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE());
	RETURN result;
END $$
DELIMITER ;

INSERT INTO young_animals (animal_type, animal_name, date_of_birth, age_month)
SELECT *, age_animal(date_of_birth) 
FROM (
	SELECT 'cat' AS animal_type, animal_name, date_of_birth FROM cat
    UNION
    SELECT 'dog' AS animal_type, animal_name, date_of_birth FROM dog
    UNION 
    SELECT 'hamster' AS animal_type, animal_name, date_of_birth FROM hamster
    UNION
    SELECT 'horse' AS animal_type, animal_name, date_of_birth FROM horse_donkey
    WHERE id_kind_of_animal = 4
    UNION
    SELECT 'donkey' AS animal_type, animal_name, date_of_birth FROM horse_donkey
    WHERE id_kind_of_animal = 6
) AS animal_type
WHERE date_of_birth BETWEEN '2021-05-01' AND '2023-05-01';
```
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.

```
CREATE TABLE all_animals AS
SELECT * FROM cat
UNION ALL
SELECT * FROM dog
UNION ALL
SELECT * FROM hamster
UNION ALL
SELECT * FROM horse_donkey;
```
13.Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
14. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:
14.1 Завести новое животное
14.2 определять животное в правильный класс
14.3 увидеть список команд, которое выполняет животное
14.4 обучить животное новым командам
14.5 Реализовать навигацию по меню
15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
животное” Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.
