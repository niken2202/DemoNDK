package com.example.niken.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText et;
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
        System.loadLibrary("test-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
         tv = (TextView) findViewById(R.id.sample_text);
        et =  (EditText) findViewById(R.id.editText);
    }
public void btnClick(View view){
        int number = Integer.parseInt(et.getText().toString());
        if(isPrime(number)){
            tv.setText(number+ " is a prime number!");
        } else{
            tv.setText(number+ " is not a prime number!");
        }
}
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native boolean isPrime(int number);
}
