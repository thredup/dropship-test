package repository

class EventRepo {
    fun getAllEvents(): List<SyncEvent> {
        return (getUploadEvents() + getListEvents()).shuffled();
    }

    fun getUploadEvents(): List<SyncEvent> {
        return listOf(
            SyncEvent(SyncType.upload_photo, Item("item1", 1, ItemState.pending)),
            SyncEvent(SyncType.upload_photo, Item("item2", 2, ItemState.deleted)),
            SyncEvent(SyncType.upload_photo, Item("item3", 1, ItemState.pending)),
            SyncEvent(SyncType.upload_photo, Item("item4", 2, ItemState.pending)),
            SyncEvent(SyncType.upload_photo, Item("item5", 1, ItemState.pending)),
            SyncEvent(SyncType.upload_photo, Item("item6", 2, ItemState.deleted)),
            SyncEvent(SyncType.upload_photo, Item("item7", 1, ItemState.pending)),
            SyncEvent(SyncType.upload_photo, Item("item8", 2, ItemState.pending)),
            SyncEvent(SyncType.upload_photo, Item("item9", 1, ItemState.pending)),
        )
    }

    fun getListEvents(): List<SyncEvent> {
        return listOf(
            SyncEvent(SyncType.list_item, Item("item1", 1, ItemState.pending)),
            SyncEvent(SyncType.list_item, Item("item2", 2, ItemState.photo_uploaded)),
            SyncEvent(SyncType.list_item, Item("item3", 1, ItemState.listed)),
            SyncEvent(SyncType.list_item, Item("item7", 1, ItemState.pending)),
            SyncEvent(SyncType.list_item, Item("item8", 2, ItemState.pending)),
            SyncEvent(SyncType.list_item, Item("item9", 1, ItemState.photo_uploaded)),
            SyncEvent(SyncType.list_item, Item("item10", 2, ItemState.photo_uploaded)),
            SyncEvent(SyncType.list_item, Item("item11", 1, ItemState.photo_uploaded)),
            SyncEvent(SyncType.list_item, Item("item12", 2, ItemState.photo_uploaded)),
        )
    }
}