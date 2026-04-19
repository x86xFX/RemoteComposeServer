package presentation.components.main_components

import androidx.compose.remote.core.operations.layout.managers.RowLayout
import androidx.compose.remote.core.operations.layout.managers.TextLayout
import androidx.compose.remote.creation.RemoteComposeContext
import presentation.ui.WhiteColor
import presentation.components.sub_components.spacer
import presentation.components.sub_components.titleIndictor

internal fun RemoteComposeContext.pricingTopBarWithIndicator() {
    row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0, 10, 0, 50),
        vertical = RowLayout.CENTER,
        horizontal = RowLayout.SPACE_BETWEEN
    ) {
        text(
            string = "Pricing",
            maxLines = 1,
            fontSize = 100f,
            fontWeight = 300f,
            color = WhiteColor,
            overflow = TextLayout.OVERFLOW_ELLIPSIS
        )

        row(
            horizontal = RowLayout.CENTER,
            vertical = RowLayout.CENTER
        ) {
            titleIndictor()
            spacer()
            titleIndictor(enable = true)
            spacer()
            titleIndictor()
        }
    }
}