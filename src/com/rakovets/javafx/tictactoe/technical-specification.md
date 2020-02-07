# Project `Tic-Tac-Toe`
## Description
Создать игру крестики-нолики.
![Tic-Tac-Toe](/res/img/gui-tictactoe.png)


## Development steps
- Создать **view** (т.е. UI): `TicTacToeView.fxml`
- Создать **controller**: `TicTacToeController`
- Сделать **binding** `TicTacToeView.fxml` c `TicTacToeController`
- Привязать **components** `Buttons` в **view** к **controller**
- Добавить **listener**, для всех **components** `Button`  обработку **event** `onMouseClicked`, который выведет в **Standard Output**: `Pressed button`
- Обновить **listeners**, который для **events** будет менять текст в `Button` на `X`
- Создать метод `getPlayerSymbol()` в классе `TicTacToeModel`, который будет возвращать символ игрока, который сейчас ходит
- Обновить **listeners**, который для **events** будет менять текст в `Button` на символ игрока, который сейчас ходит
- Обновить **listeners**, который для **events** не будет менять текст в `Button` если там уже есть другой символ
- Создать метод `getWinnerIfExist(List<String> positionValues)` в классе `TicTacToeModel`, который будет возвращать символ игрока, который победил в игре. Если ничья, тогда метод возвращает `DRAW`. Если победитель еще не определен, тогда `SOON`
- Обновить **listeners**, который для **events** будет проверять есть ли победитель или ничья, и выводит соответствующее сообщение.