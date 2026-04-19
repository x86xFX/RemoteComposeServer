package presentation.components.sub_components

import androidx.compose.remote.creation.RemoteComposeContext
import androidx.compose.remote.creation.modifiers.RecordingModifier
import androidx.compose.remote.creation.modifiers.RoundedRectShape
import presentation.ui.GreenTickColor

internal fun RemoteComposeContext.circleShape(modifier: RecordingModifier = Modifier) {
    box(
        modifier = modifier
            .clip(RoundedRectShape(100f, 100f, 100f, 100f))
            .size(60)
            .background(GreenTickColor)
    )
}