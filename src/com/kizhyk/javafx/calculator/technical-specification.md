# Project `Calculator`
## Description
Создать калькулятор.
![Сalculator](/res/img/gui-calculator.png)


## Development steps
- Создать **view** (т.е. UI): `calculator.fxml`
- Создать **controller**: `CalculatorController`
- Сделать **binding** `calculator.fxml` c `CalculatorController`
- Привязать **component** `TextField` в **view** к **controller**
- Добавить **listener**, для всех **components** `Button`  обработку **event** `onMouseClicked`, который выведет в **Standard Output**: `Pressed button: ${buttonName}`, где `${buttonName}` название **button**
- Добавить **listener**, для  **components** `Button` с названием `0`-`9`, `+`, `-`, `/`, `*`  обработку **event** `onKeyPressed`, который выведет в **Standard Output**: `Pressed button: ${buttonName}`, где `${buttonName}` название **button**
- Обновить **listeners**, который для **events** будут выводить в `TextField` соответствующий символ или цифру
- Обновить **listeners**, который для **events** будут добавлять к текущему содержимому в `TextField` соответствующий символ или цифру (т.е. не будет замены текущего содержимого)
- Обновить **listener**, который для **event**, нажатие на `Button` с названием `CE`, будет очищать `TextField`
- Обновить **listeners**, который для **events**, нажатие на `Button`/**Key** `=`, будет выводить в `TextField` результат операции
- **Добавить возможность вводить комбинированные операции
- **Добавить валидацию выражения для вычисления и вывод информации в случае ошибки