package com.example.awesomefat.csc548_spring2018_numberconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //made a change
    
    private TextView bitsTV;
    private TextView kbitsTV;
    private TextView mbitsTV;
    private TextView gbitsTV;
    private TextView tbitsTV;
    private TextView bytesTV;
    private TextView kbytesTV;
    private TextView mbytesTV;
    private TextView gbytesTV;
    private TextView tbytesTV;


    private EditText mbET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.bitsTV = (TextView)this.findViewById(R.id.bitsTV);
        this.kbitsTV = (TextView)this.findViewById(R.id.kbitsTV);
        this.mbitsTV = (TextView)this.findViewById(R.id.mbitsTV);
        this.gbitsTV = (TextView)this.findViewById(R.id.gbitsTV);
        this.tbitsTV = (TextView)this.findViewById(R.id.tbitsTV);

        this.bytesTV = (TextView)this.findViewById(R.id.bytesTV);
        this.kbytesTV = (TextView)this.findViewById(R.id.kbytesTV);
        this.mbytesTV = (TextView)this.findViewById(R.id.mbytesTV);
        this.gbytesTV = (TextView)this.findViewById(R.id.gbytesTV);
        this.tbytesTV = (TextView)this.findViewById(R.id.tbytesTV);

        this.mbET = (EditText)this.findViewById(R.id.mbET);
    }
    private String roundOffNumber(double num)
    {
        return String.format("%.6f", num);
    }

    public void clickMeButtonPressed(View v)
    {
        if (this.mbET.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this, "Enter some value",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        String sInputMB = this.mbET.getText().toString();

        int iInputMB = Integer.parseInt(sInputMB);

        int mbits = iInputMB * 8;

        int kbytes = iInputMB * 1024;
        int kbits = kbytes * 8;

        int bytes = kbytes * 1024;
        int bits = bytes * 8;

        double gbytes = (double)iInputMB / 1024;
        double gbits = gbytes * 8;

        double tbytes = (double)gbytes / 1024;
        double tbits = tbytes * 8;


        bitsTV.setText("" +  bits + " bits");
        kbitsTV.setText("" +  kbits  + " kb");
        mbitsTV.setText("" +  mbits + " mb");
        gbitsTV.setText("" +  roundOffNumber(gbits) + " gb");
        tbitsTV.setText("" +  roundOffNumber(tbits) + " tb");

        bytesTV.setText("" +  bytes + " bytes");
        kbytesTV.setText("" +  kbytes + " kB");
        mbytesTV.setText("" +  iInputMB + " MB");
        gbytesTV.setText("" +  roundOffNumber(gbytes) + " GB");
        tbytesTV.setText("" +  roundOffNumber(tbytes) + " TB");

    }

    public void clearButtonPressed(View v)
    {
        bitsTV.setText(" bits");
        kbitsTV.setText(" kb" );
        mbitsTV.setText(" mb");
        gbitsTV.setText(" gb" );
        tbitsTV.setText(" tb" );

        bytesTV.setText(" bytes" );
        kbytesTV.setText(" kB" );
        mbytesTV.setText(" MB" );
        gbytesTV.setText(" GB");
        tbytesTV.setText(" TB");
    }

}
