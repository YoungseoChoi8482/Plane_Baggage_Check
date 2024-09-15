package com.example.plane_check;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class international_1 extends AppCompatActivity {

    private EditText searchEditText;
    private Button searchButton;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international1);

        // XML 레이아웃의 뷰들을 연결
        searchEditText = findViewById(R.id.searchEditText);
        searchButton = findViewById(R.id.searchButton);

        // 버튼 클릭 리스너 설정
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 검색창에서 입력된 텍스트를 가져옴
                String searchText = searchEditText.getText().toString().trim();

                if (!searchText.isEmpty()) {
                    // 검색어가 입력되었을 경우 처리
                    // 추후에 Firebase나 SQLite에서 검색할 때 이 부분에 검색 코드를 추가
                    Toast.makeText(international_1.this, "검색어: " + searchText, Toast.LENGTH_SHORT).show();
                } else {
                    // 검색어가 비어있을 경우 경고 메시지
                    Toast.makeText(international_1.this, "검색어를 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}