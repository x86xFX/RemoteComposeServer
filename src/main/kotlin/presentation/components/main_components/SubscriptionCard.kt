package presentation.components.main_components

import androidx.compose.remote.core.operations.layout.managers.ColumnLayout
import androidx.compose.remote.core.operations.layout.managers.RowLayout
import androidx.compose.remote.creation.RemoteComposeContext
import androidx.compose.remote.creation.actions.Action
import androidx.compose.remote.creation.modifiers.RoundedRectShape
import presentation.ui.CardBackgroundColor
import presentation.ui.PrimaryColor
import presentation.ui.SecondaryTextColor
import presentation.ui.WhiteColor
import presentation.components.sub_components.checkItem
import presentation.components.sub_components.dashedPath
import presentation.components.sub_components.purchaseButton
import presentation.components.sub_components.saveChip
import presentation.components.sub_components.spacer
import presentation.components.sub_components.strikethroughText

internal fun RemoteComposeContext.subscriptionCard(onPurchase: Action) {
    box(
        modifier = Modifier
            .clip(RoundedRectShape(50f, 50f, 50f, 50f))
            .background(PrimaryColor)
            .padding(10)
    ) {
        column(
            modifier = Modifier
                .clip(RoundedRectShape(50f, 50f, 50f, 50f))
                .background(CardBackgroundColor)
        ) {
            row(
                modifier = Modifier.fillMaxWidth(),
                vertical = RowLayout.TOP,
                horizontal = RowLayout.SPACE_BETWEEN
            ) {
                text(
                    modifier = Modifier.padding(50, 50, 0, 0),
                    string = "Design Ace",
                    fontSize = 60f,
                    fontWeight = 450f,
                    color = WhiteColor
                )

                saveChip()
            }

            spacer(height = 30)

            column(modifier = Modifier.padding(50)) {
                row(
                    horizontal = RowLayout.CENTER,
                    vertical = RowLayout.CENTER
                ) {
                    strikethroughText(
                        string = "$29"
                    )

                    spacer(width = 15)

                    text(
                        string = "$19",
                        fontSize = 120f,
                        fontWeight = 300f,
                        color = PrimaryColor
                    )

                    spacer(width = 5)

                    column(
                        horizontal = ColumnLayout.START,
                        vertical = ColumnLayout.CENTER
                    ) {
                        text(
                            string = "/ month (USD)",
                            fontSize = 50f,
                            fontWeight = 300f,
                            color = PrimaryColor
                        )

                        text(
                            string = "$250 billed yearly",
                            fontSize = 50f,
                            fontWeight = 300f,
                            color = PrimaryColor
                        )
                    }
                }

                spacer(height = 30)

                text(
                    string = "A professional platform for creative minds, providing advanced tools to optimize design workflows",
                    fontSize = 40f,
                    fontWeight = 300f,
                    color = SecondaryTextColor
                )

                spacer(height = 50)

                dashedPath()

                spacer(height = 50)

                checkItem(title = "Access to all creative assets ")
                checkItem(title = "Unlimited cloud storage  ")
                checkItem(title = "Advanced brush tools")
                checkItem(title = "Invite up to 10 contributors")
                checkItem(title = "Review versioned histories")
                checkItem(title = "Modify and export assets")
                checkItem(title = "Direct advice", isChecked = false)
                checkItem(title = "Seamless cloud sync tech", isChecked = false)
                checkItem(title = "Intuitive vector-based canvases", isChecked = false)

                spacer(height = 100)

                purchaseButton(
                    modifier = Modifier.fillMaxWidth(),
                    action = onPurchase
                )
            }
        }
    }
}