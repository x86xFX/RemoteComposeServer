package presentation.components.sub_components

import androidx.compose.remote.core.operations.layout.managers.RowLayout
import androidx.compose.remote.creation.RemoteComposeContext
import presentation.ui.DisabledTextColor
import presentation.ui.WhiteColor

internal fun RemoteComposeContext.checkItem(
    title: String,
    isChecked: Boolean = true,
    enabledTextColor: Int = WhiteColor,
    disabledTextColor: Int = DisabledTextColor
) {
    row(
        modifier = Modifier.padding(0, 20, 0, 20),
        horizontal = RowLayout.START,
        vertical = RowLayout.CENTER
    ) {
        if (isChecked) {
            circleShape()
        } else {
            disabledCircleShape()
        }

        spacer(width = 40)

        text(
            string = title,
            fontSize = 40f,
            fontWeight = 350f,
            color = if (isChecked) enabledTextColor else disabledTextColor
        )
    }
}