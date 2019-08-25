package com.testing.dev.dailyexpensenote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.testing.dev.dailyexpensenote.databinding.ActivityExpenseDetsailsBinding;

public class ExpenseDetsailsActivity extends AppCompatActivity {

    private ActivityExpenseDetsailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_expense_detsails);

        binding.backBtnIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
