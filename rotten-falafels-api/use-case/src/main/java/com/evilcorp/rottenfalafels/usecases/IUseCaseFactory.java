package com.evilcorp.rottenfalafels.usecases;

import com.evilcorp.rottenfalafels.usecases.inquire.movies.movie_summary.IMovieSummaryUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.movies.movies_summary.IMoviesSummaryUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_avg_rating.IAvgMovieRatingUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_ratings.IMovieRatingsUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.movie.IMoviePublishingUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.movie.movie_negative_reviews.INegativeMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_positive_reviews.IPositiveMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_reviews.IAllMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.review.IMovieReviewPublishingUseCase;

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
