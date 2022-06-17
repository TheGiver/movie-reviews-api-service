package org.evilcorp.rottenfalafels.usecases;

import org.evilcorp.rottenfalafels.usecases.inquire.movies.movie_summary.IMovieSummaryUseCase;
import org.evilcorp.rottenfalafels.usecases.inquire.movies.movies_summary.IMoviesSummaryUseCase;
import org.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_avg_rating.IAvgMovieRatingUseCase;
import org.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_ratings.IMovieRatingsUseCase;
import org.evilcorp.rottenfalafels.usecases.publish.movie.IMoviePublishingUseCase;
import org.evilcorp.rottenfalafels.usecases.publish.movie.movie_negative_reviews.INegativeMovieReviewsUseCase;
import org.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_positive_reviews.IPositiveMovieReviewsUseCase;
import org.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_reviews.IAllMovieReviewsUseCase;
import org.evilcorp.rottenfalafels.usecases.publish.review.IMovieReviewPublishingUseCase;

public interface IUseCaseFactory {
    IMovieSummaryUseCase makeMovieSummaryUseCase();

    IMoviesSummaryUseCase makeMoviesSummaryUseCase();

    IAvgMovieRatingUseCase makeAvgMovieRatingUseCase();

    IMovieRatingsUseCase makeMovieRatingsUseCase();

    INegativeMovieReviewsUseCase makeNegativeReviewsUseCase();

    IPositiveMovieReviewsUseCase makePositiveMovieReviewsUseCase();

    IAllMovieReviewsUseCase makeAllMovieReviewsUseCase();

    IMoviePublishingUseCase makeMoviePublishingUseCase();

    IMovieReviewPublishingUseCase makeMovieReviewPublishingUseCase();
}
