package satoyuya.example.com;

import satoyuya.example.com.authenticator.BootstrapAuthenticatorActivity;
import satoyuya.example.com.core.TimerService;
import satoyuya.example.com.ui.BootstrapActivity;
import satoyuya.example.com.ui.BootstrapFragmentActivity;
import satoyuya.example.com.ui.BootstrapTimerActivity;
import satoyuya.example.com.ui.CheckInsListFragment;
import satoyuya.example.com.ui.MainActivity;
import satoyuya.example.com.ui.NavigationDrawerFragment;
import satoyuya.example.com.ui.NewsActivity;
import satoyuya.example.com.ui.NewsListFragment;
import satoyuya.example.com.ui.UserActivity;
import satoyuya.example.com.ui.UserListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModule.class,
                BootstrapModule.class
        }
)
public interface BootstrapComponent {

    void inject(BootstrapApplication target);

    void inject(BootstrapAuthenticatorActivity target);

    void inject(BootstrapTimerActivity target);

    void inject(MainActivity target);

    void inject(CheckInsListFragment target);

    void inject(NavigationDrawerFragment target);

    void inject(NewsActivity target);

    void inject(NewsListFragment target);

    void inject(UserActivity target);

    void inject(UserListFragment target);

    void inject(TimerService target);

    void inject(BootstrapFragmentActivity target);
    void inject(BootstrapActivity target);


}
