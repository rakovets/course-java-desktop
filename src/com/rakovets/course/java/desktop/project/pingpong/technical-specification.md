# Project `Ping-Pong`

## Description

Создать игру Ping-Pong на двоих.
![Ping-Pong](/res/img/gui-ping-pong.png)

## Development steps

- Создать **view** (т.е. UI): `PingPongView.fxml`
- Создать **controller**: `PingPongController`
- Сделать **binding** `PingPongView.fxml` c `PingPongController`
- Привязать **components** `Rectangle`/`Circle` в **view** к **controller**
- Добавить **listener**, для **component** `Group` на обработку **event** `onKeyPressed`, который выведет в **Standard Output**: `Pressed key`
- Обновить **listeners**, который для **events** выведет в **Standard Output**: `Pressed key ${keyCode}`
- Добавить метод отвечающий за передвижение первого игрока и вызвать его при соответствующих **events**
- Добавить метод отвечающий за передвижение второго игрока и вызвать его при соответствующих **events**
- Добавить метод отвечающий за движение мяча и его взаимодействие с границами игрового поля
- Добавить, в метод отвечающий за движение мяча, взаимодействие с игроками
- Добавить возможность выхода из игры при соответствующем **event**
- Добавить возможность запустить новую игру при соответствующем **event**
- ** Добавить счет

## Help

1. Для того, что бы контролер смог обрабатывать нажатия клавиш на клавиатуре для компонента группа необходимо.
- Добавить в конец метода `start()` в классе `PingPongStarter`:

```java
root.requestFocus(); // root - variable of type Parent
```

- Добавить в компонент `Group` атрибут `focusTraversable="true"`

2. Для инициализации создать метод  `public void initialize()`

3. Для динамического изменения свойств компонентов типа `Shape` необходимо:
- Добавить поле где будет хранится свойство этого компонента в **controller**:

```java
DoubleProperty currentYBluePaddle = new SimpleDoubleProperty();
```

- Сделать **binding** добавленного поля к **component** `Shape` в методе `initialize()`

```java
currentYBluePaddle.set(bluePaddle.getLayoutY()); // bluePaddle - field of type Rectangle
bluePaddle.layoutYProperty().bind(currentYBluePaddle);
```

4. Для создания анимации передвижения необходимо:
- Добавить поле где будет хранится анимация компонента в **controller**

```java
Timeline timeline;
```

- Добавить код для анимации в нужны метод:

```java
KeyFrame keyFrame = new KeyFrame(new Duration(10), event -> { // Создаем объект "кадра", задаем период повторения и действия которые будут выполняться
    //TODO весь этот код представляет собой программирование поведения мяча => это ТОЛЬКО пример => Его нужно изменить что бы он соответствовал поведению мяча в вашей игре
    System.out.println(ballCenterX); // выводим в терминал текущую позицию мяча
    if (ballCenterX.get() > 0) { // если мяч дошел до левой границы тогда
        ballCenterX.set(ballCenterX.get() - BALL_SPEED); // меняем его позицию
    } else { //иначе
        timeline.stop(); // остонавливаем анимацию
    }
});

timeline = new Timeline(keyFrame); // создаем объект анимации куда помещаем наш кадр анимации
timeline.setCycleCount(Timeline.INDEFINITE); // задаем цикл повторения
timeline.play(); // запускаем анимацию
```
