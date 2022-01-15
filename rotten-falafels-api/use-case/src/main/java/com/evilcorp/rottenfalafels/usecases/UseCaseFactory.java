package com.evilcorp.rottenfalafels.usecases;

import com.evilcorp.rottenfalafels.usecases.inquire.movies.movie_summary.IMovieSummaryUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.movies.movies_summary.IMoviesSummaryUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_avg_rating.IAvgMovieRatingUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_ratings.IMovieRatingsUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_positive_reviews.IPositiveMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_reviews.IAllMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.movie.IMoviePublishingUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.movie.movie_negative_reviews.INegativeMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.review.IMovieReviewPublishingUseCase;

public class UseCaseFactory implements IUseCaseFactory {
    @Override
    public IMovieSummaryUseCase makeMovieSummaryUseCase() {
        return null;
    }

    @Override
    public IMoviesSummaryUseCase makeMoviesSummaryUseCase() {
        return null;
    }

    @Override
    public IAvgMovieRatingUseCase makeAvgMovieRatingUseCase() {
        return null;
    }

    @Override
    public IMovieRatingsUseCase makeMovieRatingsUseCase() {
        return null;
    }

    @Override
    public INegativeMovieReviewsUseCase makeNegativeReviewsUseCase() {
        return null;
    }

    @Override
    public IPositiveMovieReviewsUseCase makePositiveMovieReviewsUseCase() {
        return null;
    }

    @Override
    public IAllMovieReviewsUseCase makeAllMovieReviewsUseCase() {
        return null;
    }

    @Override
    public IMoviePublishingUseCase makeMoviePublishingUseCase() {
        return null;
    }

    @Override
    public IMovieReviewPublishingUseCase makeMovieReviewPublishingUseCase() {
        return null;
    }
}
