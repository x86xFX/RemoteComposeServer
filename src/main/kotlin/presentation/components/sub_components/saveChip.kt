package presentation.components.sub_components

import androidx.compose.remote.core.operations.layout.managers.BoxLayout
import androidx.compose.remote.creation.RemoteComposeContext
import androidx.compose.remote.creation.modifiers.RecordingModifier
import androidx.compose.remote.creation.modifiers.RoundedRectShape
import presentation.ui.BlackColor
import presentation.ui.PrimaryColor

internal fun RemoteComposeContext.saveChip(modifier: RecordingModifier = Modifier) {
    box(
        modifier = modifier
            .width(300)
            .clip(RoundedRectShape(0f, 50f, 50f, 0f))
            .background(PrimaryColor)
            .padding(18f),
        vertical = BoxLayout.CENTER,
        horizontal = BoxLayout.CENTER
    ) {
        text(
            string = "Less 15%",
            fontSize = 40f,
            fontWeight = 350f,
            color = BlackColor
        )
    }
}