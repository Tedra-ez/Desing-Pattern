package builder;

public class Report {
    private final String title;
    private final String author;
    private final String content;
    private final String footer;

    private Report(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.content = builder.content;
        this.footer = builder.footer;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getContent() { return content; }
    public String getFooter() { return footer; }

    @Override
    public String toString() {
        return "Report:\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Content: " + content + "\n" +
                "Footer: " + footer;
    }

    public static class Builder {
        private String title;
        private String author;
        private String content;
        private String footer;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setFooter(String footer) {
            this.footer = footer;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}
