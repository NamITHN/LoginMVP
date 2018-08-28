package com.namnt.loginmvp;

class LoginPresenterImpl implements LoginPresenter {

    private LoginView view;

    LoginPresenterImpl(LoginView view) {
        this.view = view;
    }

    @Override
    public void login(String email, String pass) {
        if (email.equals("admin") && pass.equals("admin")) {
            view.loginSuccess();
        } else {
            view.loginFail();
        }
    }
}
