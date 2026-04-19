package presentation.components.sub_components

import androidx.compose.remote.core.operations.layout.managers.RowLayout
import androidx.compose.remote.creation.RemoteComposeContext
import androidx.compose.remote.creation.actions.Action
import androidx.compose.remote.creation.modifiers.RecordingModifier
import androidx.compose.remote.creation.modifiers.RoundedRectShape
import presentation.ui.BlackColor
import presentation.ui.WhiteColor

internal fun RemoteComposeContext.purchaseButton(
    action: Action,
    modifier: RecordingModifier = Modifier
) {
    box(
        modifier = modifier
            .clip(RoundedRectShape(100f, 100f, 100f, 100f))
            .background(WhiteColor)
            .padding(50)
            .onClick(action)
    ) {
        column(
            modifier = Modifier.fillMaxWidth(),
            horizontal = RowLayout.CENTER,
            vertical = RowLayout.CENTER
        ) {
            text(
                string = "Begin 7-days Free Trial",
                fontSize = 40f,
                fontWeight = 400f,
                color = BlackColor
            )
        }
    }
}