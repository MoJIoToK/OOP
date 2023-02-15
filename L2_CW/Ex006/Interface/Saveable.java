package L2_CW.Ex006.Interface;

import L2_CW.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
