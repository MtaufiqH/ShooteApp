import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexercise.converter.GreetingItem
import com.example.composeexercise.ui.theme.ComposeExerciseTheme


@Preview(showBackground = true)
@Composable
fun DarkThemePreview() {
    ComposeExerciseTheme {
        GreetingItem(name = "Taufiq")
    }
}