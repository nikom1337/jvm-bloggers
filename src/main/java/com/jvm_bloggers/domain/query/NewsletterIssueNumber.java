package com.jvm_bloggers.domain.query;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class NewsletterIssueNumber implements Comparable<NewsletterIssueNumber> {

    private final Long value;

    public static NewsletterIssueNumber of(Long value) {
        return new NewsletterIssueNumber(value);
    }

    public Long asLong() {
        return value;
    }

    @Override
    public int compareTo(NewsletterIssueNumber anotherIssue) {
        return asLong().compareTo(anotherIssue.asLong());
    }

}
