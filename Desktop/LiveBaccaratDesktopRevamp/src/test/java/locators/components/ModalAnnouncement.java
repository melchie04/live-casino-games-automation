package locators.components;

import utilities.objects.Locator;

@SuppressWarnings("unused")
public class ModalAnnouncement {

    public Locator Close = new Locator(
            "Close",
            "Button",
            "Announcement Modal",
            "//div[@class='close']"
    );

    public Locator MarkAllAsRead = new Locator(
            "Mark all as read",
            "Button",
            "Announcement Modal",
            "//button[normalize-space()='Mark all as read']"
    );

    public Locator Announcement = new Locator(
            "Announcement",
            "Label",
            "Announcement Modal",
            "//div[normalize-space()='Announcement']"
    );

    public Locator NewAnnouncementCards = new Locator(
            "New Announcement Card",
            "Container",
            "Announcement Modal",
            "//div[@class='announcement_box_content']//div[contains(@class,'announcement_card')" +
                    " and not(contains(@class,'isRead')) and not(contains(@class,'announcement_card_'))]"
    );

    public Locator PinnedAnnouncementCards = new Locator(
            "Pinned Announcement Card",
            "Container",
            "Announcement Modal",
            "//div[@class='announcement_box_content']//div[contains(@class,'announcement_card')" +
                    " and contains(@class,'onTop') and not(contains(@class,'announcement_card_'))]"
    );

    public Locator PinIcon = new Locator(
            "Pin Icon",
            "Container",
            "Announcement Modal",
            "//div[@class='announcement_box_content']//div[contains(@class,'announcement_card')" +
                    " and contains(@class,'onTop') and not(contains(@class,'announcement_card_'))]//*[name()='svg']"
    );


    public Locator AllAnnouncementCards = new Locator(
            "All Announcement Card",
            "Container",
            "Announcement Modal",
            "//div[@class='announcement_box_content']//div[contains(@class,'announcement_card')" +
                    " and not(contains(@class,'announcement_card_'))]"
    );

}
