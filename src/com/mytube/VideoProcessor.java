package com.mytube;

public class VideoProcessor {


    public VideoProcessor(VideoEncoder encoder) {
        this.encoder = encoder;
    }

    public VideoProcessor(VideoDatabase database) {
        this.database = database;
    }

    public VideoProcessor(EmailService emailService) {
        this.emailService = emailService;
    }

    private VideoDatabase database;
    private VideoEncoder encoder;
    private EmailService emailService;


    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

