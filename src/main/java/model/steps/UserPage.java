package model.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import model.user.LoginUser;
import model.user.User;
import model.BaseApi;
import model.PathApi;

import static io.restassured.RestAssured.given;

public class UserPage extends BaseApi {
    @Step("Создание пользователя")
    public Response createUser(User user) {
        return given(RequestSpecification())
                .body(user)
                .when()
                .post(PathApi.CREATE_USER);
    }

    @Step("Авторизация пользователя")
    public Response loginUser(LoginUser loginUser) {
        return given(RequestSpecification())
                .body(loginUser)
                .when()
                .post(PathApi.LOGIN_USER);
    }

    @Step("Удаление пользователя")
    public Response deleteUser(String accessToken) {
        return given(RequestSpecification())
                .header("Authorization", accessToken)
                .when()
                .delete(PathApi.DELETE_USER);
    }

    @Step("Выход из системы")
    public Response logoutUser(String accessToken) {
        return given(RequestSpecification())
                .header("Authorization", accessToken)
                .when()
                .post(PathApi.LOGOUT_USER);
    }
}
