package presentation.components.sub_components

import androidx.compose.remote.creation.RemoteComposeContext
import presentation.ui.SecondaryTextColor

internal fun RemoteComposeContext.dashedPath(
    color: Int = SecondaryTextColor
) {
    row(
        modifier = Modifier
            .fillMaxWidth()
            .height(2f)
    ) {
        repeat(40) {
            box(
                modifier = Modifier
                    .horizontalWeight(1f)
                    .height(10f)
                    .background(color)
            )
            box(
                modifier = Modifier
                    .horizontalWeight(1f)
            )
        }
    }
}