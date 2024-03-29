package satoyuya.example.com.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import satoyuya.example.com.R;
import satoyuya.example.com.core.User;
import com.squareup.picasso.Picasso;

import butterknife.Bind;

import static satoyuya.example.com.core.Constants.Extra.USER;

public class UserActivity extends BootstrapActivity {

    @Bind(R.id.iv_avatar) protected ImageView avatar;
    @Bind(R.id.tv_name) protected TextView name;

    private User user;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.user_view);

        if (getIntent() != null && getIntent().getExtras() != null) {
            user = (User) getIntent().getExtras().getSerializable(USER);
        }

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Picasso.with(this).load(user.getAvatarUrl())
                .placeholder(R.drawable.gravatar_icon)
                .into(avatar);

        name.setText(String.format("%s %s", user.getFirstName(), user.getLastName()));

    }


}
