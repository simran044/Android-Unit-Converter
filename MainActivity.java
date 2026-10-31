public class MainActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    TextView title = findViewById(R.id.title);
    EditText etmeter = findViewById(R.id.etmeter);
    Button btnMeterToKm =
        findViewById(R.id.btnMeterToKm);

    Button btnKmToMeter =
        findViewById(R.id.btnKmToMeter);

    Button btnCmToMeter =
        findViewById(R.id.btnCmToMeter);
        
    Button btnKgToGram =
        findViewById(R.id.btnKgToGram);
        
    Button btnGramToKg = 
        findViewById(R.id.btnGramToKg);   
         
    Button btnCToF =
        findViewById(R.id.btnCToF);     
        
    Button btnFToC =
        findViewById(R.id.btnFToC);    
        
     Button btnClear =
        findViewById(R.id.btnClear);    
        
    TextView txtResult = findViewById(R.id.txtResult);
    
    title.setText("MULTI UNIT CONVERTER");
    
    btnMeterToKm.setOnClickListener(v -> {

    String value =
            etmeter.getText().toString();

    if(value.isEmpty()){
        txtResult.setText(
                "Please enter a value"
        );
        return;
    }

    double inputValue =
            Double.parseDouble(value);

    double result =
            inputValue / 1000;

    txtResult.setText(
            "Result : " +
            result +
            " Kilometer"
    );
});

btnKmToMeter.setOnClickListener(v -> {

    String value =
            etmeter.getText().toString();

    if(value.isEmpty()){
        txtResult.setText(
                "Please enter a value"
        );
        return;
    }

    double inputValue =
            Double.parseDouble(value);

    double result =
            inputValue * 1000;

    txtResult.setText(
            "Result : " +
            result +
            " Meter"
    );
});

btnCmToMeter.setOnClickListener(v -> {

    String value =
            etmeter.getText().toString();

    if(value.isEmpty()){
        txtResult.setText(
                "Please enter a value"
        );
        return;
    }

    double inputValue =
            Double.parseDouble(value);

    double result =
            inputValue / 100;

    txtResult.setText(
            "Result : " +
            result +
            " Meter"
    );
});

btnKgToGram.setOnClickListener(v -> {

    String value =
            etmeter.getText().toString();

    if(value.isEmpty()){
        txtResult.setText("Please enter a value");
        return;
    }

    double inputValue =
            Double.parseDouble(value);

    double result =
            inputValue * 1000;

    txtResult.setText(
            "Result : " +
            result +
            " Gram"
    );
});

btnGramToKg.setOnClickListener(v -> {
    
      String value =
            etmeter.getText().toString();

    if(value.isEmpty()){
        txtResult.setText("Please enter a value");
        return;
    }

    double inputValue =
            Double.parseDouble(value);

    double result =
            inputValue / 1000;

    txtResult.setText(
            "Result : " +
            result +
            " KG"
    );
    
});
   
   btnCToF.setOnClickListener(v -> {

    String value =
            etmeter.getText().toString();

    if(value.isEmpty()){
        txtResult.setText("Please enter a value");
        return;
    }

    double celsius =
            Double.parseDouble(value);

    double fahrenheit =
            (celsius * 9 / 5) + 32;

    txtResult.setText(
            "Result : " +
            fahrenheit +
            " °F"
    );
});
   
   btnFToC.setOnClickListener(v -> {

    String value =
            etmeter.getText().toString();

    if(value.isEmpty()){
        txtResult.setText("Please enter a value");
        return;
    }

    double fahrenheit =
            Double.parseDouble(value);

    double celsius =
            (fahrenheit - 32) * 5 / 9;

    txtResult.setText(
            "Result : " +
            celsius +
            " °C"
    );
});
   
btnClear.setOnClickListener(v -> {

    etmeter.setText("");

    txtResult.setText("Result : 0");

});

   }
   }
