package com.example.aldirobi.nfc_reader_v2;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NfcAdapter nfcAdapter = NfcAdapter.getDefaultAdapter(this);

        if (nfcAdapter != null && nfcAdapter.isEnabled()) {

        } else {
            finish();
        }

    }

    @Override
    protected void onNewIntent(Intent intent) {
        Toast.makeText(this, "NFC Intent Received", Toast.LENGTH_LONG).show();
        super.onNewIntent(intent);
    }

    @Override
    protected void onResume() {
        Intent intent = new Intent (this, MainActivity.class);
        intent.addFlags(Intent.FLAG_RECEIVER_REPLACE_PENDING);


        super.onResume();
    }
}
