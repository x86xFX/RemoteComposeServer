package presentation.components.sub_components

import androidx.compose.remote.creation.RemoteComposeContext
import presentation.ui.WhiteColor

internal fun RemoteComposeContext.strikethroughText(string: String) {
    box(modifier = Modifier) {
        text(
            string = string,
            fontSize = 120f,
            fontWeight = 300f,
            strikethrough = true,
            color = WhiteColor
        )

        box(
            modifier = Modifier
                .padding(0, 130 / 2, 0, 0)
                .size(140 * string.length / 2, 8)
                .background(WhiteColor)
        )
    }
}