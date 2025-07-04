package dev.astatic.nodestyclient.api.models.user;

import java.util.List;

public record TicketMessage(
        String id,
        String messageId,
        String content,
        List<String> attachments,
        String authorId,
        String createdAt,
        TicketAuthor author
) {}