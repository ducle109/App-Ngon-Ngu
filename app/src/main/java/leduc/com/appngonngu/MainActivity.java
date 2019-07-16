package leduc.com.appngonngu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView        txtInformation;
    private TextView        txtUserInformation;

    private Button          btnConfirm;

    private EditText        edtName;
    private EditText        edtEmail;
    private EditText        edtAddress;
    private EditText        edtPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name      = edtName.getText().toString();
                String email     = edtEmail.getText().toString();
                String address   = edtAddress.getText().toString();
                String phone     = edtPhone.getText().toString();

                String helloText    = getResources().getString(R.string.text_hello);
                String emailText    = getResources().getString(R.string.text_email);
                String addressText    = getResources().getString(R.string.text_address);
                String phoneText    = getResources().getString(R.string.text_phone);

                txtUserInformation.setText(helloText + ": " + name +"\n" +
                        emailText + ": " + email + "\n" +
                        addressText + ": " + address + "\n" +
                        phoneText + ": " + phone);
            }
        });

    }

    public void init() {
        txtInformation            = (TextView) findViewById(R.id.txtInformation);
        txtUserInformation        = (TextView) findViewById(R.id.txtUserInformation);

        btnConfirm                = (Button) findViewById(R.id.btnConfirm);

        edtName                   = (EditText) findViewById(R.id.edtName);
        edtEmail                  = (EditText) findViewById(R.id.edtEmail);
        edtAddress                = (EditText) findViewById(R.id.edtAddress);
        edtPhone                  = (EditText) findViewById(R.id.edtPhone);

    }
}
