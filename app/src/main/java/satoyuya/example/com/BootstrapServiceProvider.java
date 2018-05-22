package satoyuya.example.com;

import android.accounts.AccountsException;
import android.app.Activity;

import satoyuya.example.com.core.BootstrapService;

import java.io.IOException;

public interface BootstrapServiceProvider {
    BootstrapService getService(Activity activity) throws IOException, AccountsException;
}
