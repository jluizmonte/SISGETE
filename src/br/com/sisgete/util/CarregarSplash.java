package br.com.sisgete.util;

import br.com.sisgete.view.FirstSplashView;
import br.com.sisgete.view.LoginView;
import br.com.sisgete.view.SplashView;

public class CarregarSplash {

    public void setSplashTime() {

        SplashView Splash = new SplashView();
        FirstSplashView firstSplashView = new FirstSplashView();
        firstSplashView.setVisible(false);
        Splash.setVisible(true);

        for (int i = 0; i <= 80; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }

            if (i == 80) {
                LoginView loginView = new LoginView(null, true);
                Splash.setVisible(false);
                loginView.setVisible(true);
            }
        }
    }

}
