# Assignment_4 Quiz Application

# Student name: Ryan Cauble


# ID: 00267379



![screenshot1](https://user-images.githubusercontent.com/17748575/30760464-3e710d94-9fa8-11e7-9a14-5b9d30d63e9f.png)
![screenshot2](https://user-images.githubusercontent.com/17748575/30760468-40dd06f0-9fa8-11e7-82d5-c8b15b9bfd8c.png)
![screenshot3](https://user-images.githubusercontent.com/17748575/30760469-42f76b38-9fa8-11e7-850a-5447737d5e6f.png)
![screenshot4](https://user-images.githubusercontent.com/17748575/30760472-44e43660-9fa8-11e7-8022-41b6b495ca67.png)
![screeenshot5](https://user-images.githubusercontent.com/17748575/30760475-475f29fe-9fa8-11e7-8385-67c43b24176d.png)




# MainActivity.java  :

```
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitOrder(View view) {

        //// question 1
        RadioButton trueRadio1 = (RadioButton) findViewById(R.id.true1_button);
        boolean hasTrue1 = trueRadio1.isChecked();

        RadioButton falseRadio1 = (RadioButton) findViewById(R.id.false1_button);
        boolean hasFalse1 = falseRadio1.isChecked();

        //// question 2
        // Get user's month input
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();
        //String October = "October";

        boolean hasOctober;

        if (name.equals("October")) {
            hasOctober = true;
        } else {
            hasOctober = false;
        }

        //// question 3
        CheckBox red_color_CheckBox = (CheckBox) findViewById(R.id.color_red);
        boolean has_red = red_color_CheckBox.isChecked();
        CheckBox white_color_CheckBox = (CheckBox) findViewById(R.id.color_white);
        boolean has_white = white_color_CheckBox.isChecked();
        CheckBox green_color_CheckBox = (CheckBox) findViewById(R.id.color_green);
        boolean has_green = green_color_CheckBox.isChecked();
        CheckBox blue_color_CheckBox = (CheckBox) findViewById(R.id.color_blue);
        boolean has_blue = blue_color_CheckBox.isChecked();

        //// question 4

        RadioButton trueRadio2 = (RadioButton) findViewById(R.id.true2_button);
        boolean hasTrue2 = trueRadio2.isChecked();

        RadioButton falseRadio2 = (RadioButton) findViewById(R.id.false2_button);
        boolean hasFalse2 = falseRadio2.isChecked();


        //// question 5

        RadioButton trueRadio3 = (RadioButton) findViewById(R.id.true3_button);
        boolean hasTrue3 = trueRadio3.isChecked();

        RadioButton falseRadio3 = (RadioButton) findViewById(R.id.false3_button);
        boolean hasFalse3 = falseRadio3.isChecked();


        //// question 6

        RadioButton trueRadio4 = (RadioButton) findViewById(R.id.true4_button);
        boolean hasTrue4 = trueRadio4.isChecked();

        RadioButton falseRadio4 = (RadioButton) findViewById(R.id.false4_button);
        boolean hasFalse4 = falseRadio4.isChecked();


        //// question 7

        RadioButton trueRadio5 = (RadioButton) findViewById(R.id.true5_button);
        boolean hasTrue5 = trueRadio5.isChecked();

        RadioButton falseRadio5 = (RadioButton) findViewById(R.id.false5_button);
        boolean hasFalse5 = falseRadio5.isChecked();


        //// question 8

        RadioButton trueRadio6 = (RadioButton) findViewById(R.id.true6_button);
        boolean hasTrue6 = trueRadio6.isChecked();

        RadioButton falseRadio6 = (RadioButton) findViewById(R.id.false6_button);
        boolean hasFalse6 = falseRadio6.isChecked();


        //// question 9

        RadioButton trueRadio7 = (RadioButton) findViewById(R.id.true7_button);
        boolean hasTrue7 = trueRadio7.isChecked();

        RadioButton falseRadio7 = (RadioButton) findViewById(R.id.false7_button);
        boolean hasFalse7 = falseRadio7.isChecked();


        //// question 10

        RadioButton trueRadio8 = (RadioButton) findViewById(R.id.true8_button);
        boolean hasTrue8 = trueRadio8.isChecked();

        RadioButton falseRadio8 = (RadioButton) findViewById(R.id.false8_button);
        boolean hasFalse8 = falseRadio8.isChecked();



        // Calculate the score
        int score = calculateScore(hasTrue1, hasFalse1, hasOctober, has_red, has_white, has_green,
                has_blue, hasTrue2, hasFalse2, hasTrue3, hasFalse3, hasTrue4, hasFalse4, hasTrue5,
                hasFalse5, hasTrue6, hasFalse6, hasTrue7, hasFalse7, hasTrue8, hasFalse8);

        // Display the score summary on the screen
        String message = createOrderSummary(score);

        TextView textView=(TextView)findViewById(R.id.price_print);
        textView.setText(message);



    }


    private int calculateScore(boolean addTrue1, boolean addFalse1, boolean addOctober,
                               boolean add_red, boolean add_white, boolean add_green,
                               boolean add_blue, boolean addTrue2, boolean addFalse2,
                               boolean addTrue3, boolean addFalse3, boolean addTrue4,
                               boolean addFalse4, boolean addTrue5, boolean addFalse5,
                               boolean addTrue6, boolean addFalse6, boolean addTrue7,
                               boolean addFalse7, boolean addTrue8, boolean addFalse8) {
        int basePrice = 0;

        // question 1
        if (addTrue1) {
            basePrice = basePrice + 10;
        }
        // question 2
        if (addOctober) {
            basePrice = basePrice + 10;
        }
        // question 3
        if (addFalse1) {
            basePrice = basePrice + 0;
        }
        if (add_red & add_white & add_blue) {
            basePrice = basePrice + 10;
        }
        if (add_green) {
            basePrice = basePrice + 0;
        }
        // question 4
        if (addTrue2) {
            basePrice = basePrice + 10;
        }
        if (addFalse2) {
            basePrice = basePrice + 0;
        }
        // question 5
        if (addTrue3) {
            basePrice = basePrice + 10;
        }
        if (addFalse3) {
            basePrice = basePrice + 0;
        }
        // question6
        if (addTrue4) {
            basePrice = basePrice + 10;
        }
        if (addFalse4) {
            basePrice = basePrice + 0;
        }
        // question 7
        if (addTrue5) {
            basePrice = basePrice + 10;
        }
        if (addFalse5) {
            basePrice = basePrice + 0;
        }
        // question 8
        if (addTrue6) {
            basePrice = basePrice + 10;
        }
        if (addFalse6) {
            basePrice = basePrice + 0;
        }
        // question 9
        if (addTrue7) {
            basePrice = basePrice + 10;
        }
        if (addFalse7) {
            basePrice = basePrice + 0;
        }
        // question 10
        if (addTrue8) {
            basePrice = basePrice + 0;
        }
        if (addFalse8) {
            basePrice = basePrice + 10;
        }


        return  basePrice;
    }


    private String createOrderSummary( int score) {
        String priceMessage = "Your Score Is:";
        priceMessage += "\n" + score;
        priceMessage += "\n" + getString(R.string.thank_you);
        return priceMessage;
    }



}

```

# activity_main.xml  :

```
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:paddingBottom="@dimen/activity_vertical_margin"
        android:paddingLeft="@dimen/activity_horizontal_margin"
        android:paddingRight="@dimen/activity_horizontal_margin"
        android:paddingTop="@dimen/activity_vertical_margin">

        <TextView
            style="@style/HeaderTextStyle"
            android:text="@string/question1" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <RadioGroup
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:orientation="horizontal">

                <RadioButton
                    android:id="@+id/true1_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:checked="false"
                    android:text="@string/True1" />

                <RadioButton
                    android:id="@+id/false1_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="@string/False1" />


            </RadioGroup>

        </LinearLayout>


        <TextView
            style="@style/HeaderTextStyle"
            android:text="@string/question2" />


        <EditText
            android:id="@+id/name_field"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/name"
            android:inputType="text" />

        <TextView
            style="@style/HeaderTextStyle"
            android:text="@string/question3" />

        <CheckBox
            android:id="@+id/color_red"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:paddingLeft="24dp"
            android:text="@string/Red"
            android:textSize="16sp" />

        <CheckBox
            android:id="@+id/color_white"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:paddingLeft="24dp"
            android:text="@string/White"
            android:textSize="16sp" />


        <CheckBox
            android:id="@+id/color_green"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:paddingLeft="24dp"
            android:text="@string/Green"
            android:textSize="16sp" />

        <CheckBox
            android:id="@+id/color_blue"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:paddingLeft="24dp"
            android:text="@string/Blue"
            android:textSize="16sp" />


        <TextView
            style="@style/HeaderTextStyle"
            android:text="@string/question4" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <RadioGroup
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:orientation="horizontal">

                <RadioButton
                    android:id="@+id/true2_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:checked="false"
                    android:text="@string/True2" />

                <RadioButton
                    android:id="@+id/false2_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="@string/False2" />


            </RadioGroup>

        </LinearLayout>


        <TextView
            style="@style/HeaderTextStyle"
            android:text="@string/question5" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <RadioGroup
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:orientation="horizontal">

                <RadioButton
                    android:id="@+id/true3_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:checked="false"
                    android:text="@string/True3" />

                <RadioButton
                    android:id="@+id/false3_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="@string/False3" />


            </RadioGroup>

        </LinearLayout>

        <TextView
            style="@style/HeaderTextStyle"
            android:text="@string/question6" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <RadioGroup
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:orientation="horizontal">

                <RadioButton
                    android:id="@+id/true4_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:checked="false"
                    android:text="@string/True4" />

                <RadioButton
                    android:id="@+id/false4_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="@string/False4" />


            </RadioGroup>

        </LinearLayout>


        <TextView
            style="@style/HeaderTextStyle"
            android:text="@string/question7" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <RadioGroup
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:orientation="horizontal">

                <RadioButton
                    android:id="@+id/true5_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:checked="false"
                    android:text="@string/True5" />

                <RadioButton
                    android:id="@+id/false5_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="@string/False5" />


            </RadioGroup>

        </LinearLayout>



        <TextView
            style="@style/HeaderTextStyle"
            android:text="@string/question8" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <RadioGroup
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:orientation="horizontal">

                <RadioButton
                    android:id="@+id/true6_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:checked="false"
                    android:text="@string/True6" />

                <RadioButton
                    android:id="@+id/false6_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="@string/False6" />


            </RadioGroup>

        </LinearLayout>


        <TextView
            style="@style/HeaderTextStyle"
            android:text="@string/question9" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <RadioGroup
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:orientation="horizontal">

                <RadioButton
                    android:id="@+id/true7_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:checked="false"
                    android:text="@string/True7" />

                <RadioButton
                    android:id="@+id/false7_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="@string/False7" />


            </RadioGroup>

        </LinearLayout>



        <TextView
            style="@style/HeaderTextStyle"
            android:text="@string/question10" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <RadioGroup
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:orientation="horizontal">

                <RadioButton
                    android:id="@+id/true8_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:checked="false"
                    android:text="@string/True8" />

                <RadioButton
                    android:id="@+id/false8_button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="@string/False8" />


            </RadioGroup>

        </LinearLayout>



        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:onClick="submitOrder"
            android:text="@string/scorequiz" />


        <EditText
            android:id="@+id/price_print"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:ems="10"
            android:inputType="textMultiLine" />



    </LinearLayout>
</ScrollView>

```
