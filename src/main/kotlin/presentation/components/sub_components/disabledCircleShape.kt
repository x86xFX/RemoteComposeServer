package presentation.components.sub_components

import androidx.compose.remote.core.operations.layout.modifiers.ShapeType.CIRCLE
import androidx.compose.remote.creation.RemoteComposeContext
import androidx.compose.remote.creation.modifiers.RecordingModifier
import androidx.compose.remote.creation.modifiers.RoundedRectShape
import presentation.ui.DisabledBorderColor

internal fun RemoteComposeContext.disabledCircleShape(modifier: RecordingModifier = Modifier) {
    box(
        modifier = modifier
            .clip(RoundedRectShape(100f, 100f, 100f, 100f))
            .size(60)
            .border(
                6f,
                10f,
                DisabledBorderColor,
                CIRCLE
            )
    )
}