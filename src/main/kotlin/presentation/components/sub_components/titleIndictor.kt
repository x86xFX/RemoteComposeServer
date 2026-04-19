package presentation.components.sub_components

import androidx.compose.remote.creation.RemoteComposeContext
import androidx.compose.remote.creation.modifiers.RecordingModifier
import androidx.compose.remote.creation.modifiers.RoundedRectShape
import presentation.ui.InactiveIndicatorColor
import presentation.ui.PrimaryColor

internal fun RemoteComposeContext.titleIndictor(
    modifier: RecordingModifier = Modifier,
    enable: Boolean = false
) {
    box(
        modifier = modifier
            .size(30, 10)
            .clip(RoundedRectShape(28f, 28f, 28f, 28f))
            .background(if (enable) PrimaryColor else InactiveIndicatorColor)
    )
}
