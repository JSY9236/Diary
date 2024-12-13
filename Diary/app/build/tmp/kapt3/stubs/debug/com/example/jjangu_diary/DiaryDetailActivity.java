package com.example.jjangu_diary;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/jjangu_diary/DiaryDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/jjangu_diary/DiaryAdapter;", "binding", "Lcom/example/jjangu_diary/databinding/ActivityDiaryDetailBinding;", "diaryList", "", "Lcom/example/jjangu_diary/DiaryItem;", "checkListEmpty", "", "deleteItem", "position", "", "fetchDiaryEntries", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showDeleteDialog", "showEditDialog", "app_debug"})
public final class DiaryDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.jjangu_diary.databinding.ActivityDiaryDetailBinding binding;
    private java.util.List<com.example.jjangu_diary.DiaryItem> diaryList;
    private com.example.jjangu_diary.DiaryAdapter adapter;
    
    public DiaryDetailActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fetchDiaryEntries() {
    }
    
    private final void showDeleteDialog(int position) {
    }
    
    private final void showEditDialog(int position) {
    }
    
    private final void deleteItem(int position) {
    }
    
    private final void checkListEmpty() {
    }
}