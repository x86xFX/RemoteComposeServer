package presentation.components.sub_components

import androidx.compose.remote.creation.RemoteComposeContext
import androidx.compose.remote.creation.modifiers.RecordingModifier

internal fun RemoteComposeContext.spacer(
    modifier: RecordingModifier = Modifier,
    width: Int = 8,
    height: Int = 0
) {
    box(
        modifier = modifier
            .width(width)
            .height(height)
    )
}