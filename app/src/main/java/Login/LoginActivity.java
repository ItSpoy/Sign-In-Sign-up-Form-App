public class LoginActivity extends AppCompatActivity {
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        submitBtn = findViewById(R.id.button3);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login logic here
                Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}