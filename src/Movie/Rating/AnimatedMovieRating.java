package Movie.Rating;

import Movie.MovieException;

public class AnimatedMovieRating extends UserRating {
    private final int min = 1;
    private final int max = 10;
    public AnimatedMovieRating(String movieId, int rating, String textReview) throws MovieException {
        super(movieId, rating, textReview);
        setMinMaxRating(min, max);
        if (!checkIfValid()) throw new MovieException("Rating for animated movie must be between " + min + " and " + max + ". Current value: " + rating + ".");
    }

    public AnimatedMovieRating(String movieId, int rating) throws MovieException {
        super(movieId, rating);
        setMinMaxRating(min, max);
        if (!checkIfValid()) throw new MovieException("Rating for animated movie must be between " + min + " and " + max + ". Current value: " + rating + ".");
    }
}
