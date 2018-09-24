package com.example.rucha.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class RouteTT extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_tt);


        TextView  textView=(TextView) findViewById(R.id.text_view1);
        TextView  textView1=(TextView) findViewById(R.id.text_view2);
        TextView  textView2=(TextView) findViewById(R.id.text_view3);
        TextView  textView3=(TextView) findViewById(R.id.text_view4);
        TextView  textView4=(TextView) findViewById(R.id.text_view5);
        TextView  textView5=(TextView) findViewById(R.id.text_view6);
        Bundle bundle=getIntent().getExtras();
        String data=bundle.get("data").toString();
        textView.setText(data+" Route Details : ");

        switch(data)
        {
            case "Rahatani Phata":{

                textView1.setText("8.45:  Rahatani Phata\n9.00:  Morya Hospital");
                textView2.setText("9.05:  Bijli Nagar\n9.10:  Bijli Nagar Bridge");
                textView3.setText("9.15:  Sambhaji Chowk\n9.20:  Akurdi Railway Station");
                textView4.setText("9.20:  Swapnpurti\n9.30:  Dehuroad");
                textView5.setText("9.35:  Shinde Petrol Pump\n9.45:  Somatne Phata");

                break;
            }
            case "Sangavi":
            {

                textView1.setText("8.20:  Old sangavi\n8.30:  New sangavi");
                textView2.setText("8.45:  Rahatani\n8.50:  Sai Mandir");
                textView3.setText("8.55:  MM college\n9.05:  Morya Hospital");
                textView4.setText("9.10:  Restern Colony\n9.15:  Hanuman Sweets");
                textView5.setText("9.20:  Sambhaji chowk\n9.35:  BhaktiShakti");
                break;

            }
            case "Katraj":
            {

                textView1.setText("8.20:  KK Market\n8.30:  Katraj");
                textView2.setText("8.45:  Ambegaon\n8.50:  Dhayari");
                textView3.setText("8.55:  Warje\n9.05:  Chandani Chowk");
                textView4.setText("9.10:  Pashankar Auto\n9.15:  Balewadi Phata");
                textView5.setText("9.20:  Wakad\n9.35:  Punavale");
                break;

            }
            case "Kothrud":
            {

                textView1.setText("8.30:  Yashawantrao\n8.35:  Kinara Hotel");
                textView2.setText("8.40:  Kothrud Depo\n8.50:  Chandani Chowk");
                textView3.setText("9.00:  Pashankar auto\n9.05:  Balewadi phata");
                textView4.setText("9.10:  Wakad\n9.20:  Punavale");
                textView5.setText("9.30:  Highway");
                break;

            }
            case "Shivaji Nagar":
            {

                textView1.setText("8.30:  Shivaji Nagar\n8.35: Central mall ");
                textView2.setText("8.45:  Sakal Nagar\n8.50:  Aundh");
                textView3.setText("8.55:  Society\n9.05:  Jagtap dairy");
                textView4.setText("9.10:  Kalewadi Phata\n9.15:  Dange Chowk");
                textView5.setText("9.20:  Rawet\n9.45:  Somatane Phata");
                break;

            }
            case "Bhosari":
            {

                textView1.setText("8.30:  Dighi\n8.35: Magzine ");
                textView2.setText("8.45:  Bhosari\n8.50:  Landewadi");
                textView3.setText("8.55:  Indrayani Centre\n9.05:  Yashwant Nagar");
                textView4.setText("9.10:  KSB Chowk\n9.15:  Thermax chowk");
                textView5.setText("9.20:  Yamuna Nagar\n9.30:  Bhakti Shakti");
                break;

            }
            case "Pune Mumbai Highway":
            {

                textView1.setText("8.30:  Dapodi\n8.35: Kasarwadi ");
                textView2.setText("8.40:  Nashik phata\n8.45:  Vallabh nagar");
                textView3.setText("8.50:  Pimpri\n9.05:  Chinchwad");
                textView4.setText("9.10:  Bijli Nagar\n9.15:  Akurdi");
                textView5.setText("9.30:  Nigdi Bridge\n9.50:  Somatane Phata");
                break;

            }
            case "Shahu Nagar":
            {

                textView1.setText("8.45:  KSB chowk\n8.50: Shahu Nagar ");
                textView2.setText("8.55:  Kasturi Market\n9.00:  Thermax chowk");
                textView3.setText("9.10:  Yamuna Nagar\n9.20:  Ankush Nagar");
                textView4.setText("9.25:  Bhakti Shakti\n9.30:  Dehu");
                textView5.setText("9.35:  Central\n9.50:  Somatane Phata");
                break;

            }
        }

    }
}

