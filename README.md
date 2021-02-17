## Нетология. Разработка приложений на Kotlin. Урок 5 (ООП: Объекты и классы). Задача 3. Wall Tests

### [Задание](https://github.com/netology-code/kt-homeworks/tree/master/05_objects):

Для [приложения](https://github.com/Yoji-kms/wall) нужно написать автотесты на ваши методы:

- на add - всего один, который проверяет, что после добавления поста id стал не равным 0
- на update - целых два:
	- удаляем пост с существующим id, возвращается true
	- удаляем пост с несуществующим id, возвращается false