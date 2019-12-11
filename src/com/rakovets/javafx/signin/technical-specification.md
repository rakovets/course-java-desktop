# Project `Sign In`
## Description
Создание окна входа в приложение.

![Sign In](/res/img/sign-in.png)


## Development steps
- Создать **view** (т.е. UI): `sing-in.fxml`
- Создать **controller**: `SingInController`
- Сделать **binding** `sing-in.fxml` c `SingInController`
- Добавить **listener**, для **component** `Button` с названием `Sign in` обрабатывающий **event** `onMouseClicked`, который выведет в **Standard Output**: `Pressed button: Sign in`
- Привязать вce **components** `TextField` в **view** к **controller**
- Обновить **listener** для этого же **event**, который будет выводить в **Standard Output**: `{"userId": "${userId}","password":"${password}"}`, где `${userId}` и `${password}` **values** введенные пользователем в соответствующие `TextField`
- Обновить **listener** для этого же  **event**, который будет проверять, является ли пользователь администратором. В зависимости от результата выводить в дополнительный **component** `Label` статус авторизации `Permission denied`/`Access successful`. Для этого создать две переменные для хранения **credentials** администратора (`admin`/`admin`). При необходимости добаить необходимый **component** в **view**