Лабораторна робота 2 - 
Опис завдання:
Реалізувати ієрархію класів до завдання з лабораторної №2 (секція Зимова школа)
При записі програми потрібно використовувати домовленості щодо оформлення коду java code convention.
Класи потрібно грамотно розкласти по пакетах.
Робота з консоллю або консольне меню повинні бути мінімальними.
Важливо: необхідно реалізувати лише ієрархію класів, код пошуку елементів у списках чи колекціях не входить в 2гу роботу
Також слід створити обєкти реалізованих вами класів у окремому класі Main, який міститиме main метод
Слід додати своє прізвище в таблицю до завдання 2 коло обраного варіанту (обирати слід самостійно)
Якщо вільних варіантів в документі більше не буде - слід написати викладачу і отримати варіант від нього

Лабораторна робота 3 - 
Опис завдання:
Необхідно створити клас - Менеджер, що міститиме логіку (приклад для варіанту 1):
Реалізувати пошук товарів, котрі можна купити для дівчинки в осінній період часу та реалізувати можливість  сортування знайдених товарів:
за ціною 
за розмірами
Реалізація сортування має передбачати можливість сортувати як за спаданням, так і за зростанням
Для сортування слід використати вбудовані методи сортування, доступні в мові Java
Сортування слід реалізувати в окремому методі
Код немає містити статичних методів/атрибутів. Дозволено лиш один статичний метод - void
Код має використовувати перелічувальний тип (Enum) (за потреби)

Лабораторна робота 4 - 
Перетворити проект з кодом 2-3 роботи таким чином, щоб його збірку можна було виконувати з-за допомогою  maven. 
При цьому варто зробити команду merge попередніх робіт в master
Важливо: збірку проекту слід виконувати з консолі командою mvn clean package

Згенерувати pom.xml можна з використанням команди maven (слід виконувати з консолі):
mvn archetype:generate -DgroupId=ua.lviv.iot -DartifactId=work -Dversion=1.0-SNAPSHOT -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -DinteractiveMode=false

