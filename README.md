### Задание 1 (сложность 3)
Необходимо создать новый поток и воспроизвести все его состояния, выведя их в консоль.
Необходимые состояния:
- NEW,
- RUNNABLE,
- BLOCKED,
- WAITING,
- TIMED_WAITING,
- TERMINATED;

### Задание 2 (сложность 2)
Создать 2 потока, которые будут по очереди выводить свое имя в консоль.

###  Задание 3 (сложность 5)
Написать программу, содержащую два потока – производитель и потребитель.
Производитель будет генерировать рандомные числа. Потребитель потреблять их.
Два потока разделяют общий буфер данных, размер которого ограничен. Если буфер пуст,
потребитель должен ждать, пока там появятся данные. Если буфер заполнен полностью,
производитель должен ждать, пока потребитель заберёт данные и место освободится.

### Задание 4 (сложность 2)
Создать служебный поток, который будет каждые n секунд выводить системное время. n
задается через конструктор потока.