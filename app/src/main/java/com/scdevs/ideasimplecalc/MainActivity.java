package com.scdevs.ideasimplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonplus, buttonminus, buttontimes, buttondivide, buttonequals;
	TextView equation, answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setButtons();
		setOnClicks();

		equation = findViewById(R.id.equation);
		answer = findViewById(R.id.answer);
	}

	void setButtons()
	{
		button0 = findViewById(R.id.button0);
		button1 = findViewById(R.id.button1);
		button2 = findViewById(R.id.button2);
		button3 = findViewById(R.id.button3);
		button4 = findViewById(R.id.button4);
		button5 = findViewById(R.id.button5);
		button6 = findViewById(R.id.button6);
		button7 = findViewById(R.id.button7);
		button8 = findViewById(R.id.button8);
		button9 = findViewById(R.id.button9);
		buttonplus = findViewById(R.id.buttonplus);
		buttonminus = findViewById(R.id.buttonminus);
		buttontimes = findViewById(R.id.buttontimes);
		buttondivide = findViewById(R.id.buttondivide);

	}

	void setOnClicks()
	{
		button0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("0");
			}
		});
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("1");
			}
		});
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("2");
			}
		});
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("3");
			}
		});
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("4");
			}
		});
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("5");
			}
		});
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("6");
			}
		});
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("7");
			}
		});
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("8");
			}
		});
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("9");
			}
		});
		buttonplus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("+");
			}
		});
		buttonminus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("-");
			}
		});
		buttontimes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("*");
			}
		});
		buttondivide.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				equation.append("/");
			}
		});
		buttonequals.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				answer.setText(findAnswer(equation.getText().toString()));
			}
		});
	}

	int findAnswer(String equation)
	{
		if (equation.contains("+"))
		{
			String[] eqArr = equation.split("\\+");
			return Integer.parseInt(eqArr[0]) +Integer.parseInt(eqArr[1]);
		}
		else if (equation.contains("-"))
		{
			String[] eqArr = equation.split("-");
			return Integer.parseInt(eqArr[0]) -Integer.parseInt(eqArr[1]);
		}
		else if (equation.contains("*"))
		{
			String[] eqArr = equation.split("\\*");
			return Integer.parseInt(eqArr[0]) *Integer.parseInt(eqArr[1]);
		}
		else
		{
			String[] eqArr = equation.split("/");
			return Integer.parseInt(eqArr[0]) /Integer.parseInt(eqArr[1]);
		}
	}
}
