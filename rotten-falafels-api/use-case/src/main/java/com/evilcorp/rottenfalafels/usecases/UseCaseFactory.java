package com.evilcorp.rottenfalafels.usecases;

import com.evilcorp.rottenfalafels.usecases.inquire.movies.movie_summary.IMovieSummaryUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.movies.movie_summary.MovieSummaryUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.movies.movies_summary.IMoviesSummaryUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.movies.movies_summary.MoviesSummaryUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_avg_rating.AvgMovieRatingsUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_avg_rating.IAvgMovieRatingUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_ratings.IMovieRatingsUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_ratings.MovieRatingsUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_positive_reviews.IPositiveMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_positive_reviews.PositiveMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_reviews.AllMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_reviews.IAllMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.movie.IMoviePublishingUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.movie.MoviePublishingUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.movie.movie_negative_reviews.INegativeMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.movie.movie_negative_reviews.NegativeMovieReviewsUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.review.IMovieReviewPublishingUseCase;
import com.evilcorp.rottenfalafels.usecases.publish.review.MovieReviewPublishingUseCase;

public class UseCaseFactory implements IUseCaseFactory {
    @Override
    public IMovieSummaryUseCase makeMovieSummaryUseCase() {
        return new MovieSummaryUseCase();
    }

    @Override
    public IMoviesSummaryUseCase makeMoviesSummaryUseCase() {
        return new MoviesSummaryUseCase();
    }

    @Override
    public IAvgMovieRatingUseCase makeAvgMovieRatingUseCase() {
        return new AvgMovieRatingsUseCase();
    }

    @Override
    public IMovieRatingsUseCase makeMovieRatingsUseCase() {
        return new MovieRatingsUseCase();
    }

    @Override
    public INegativeMovieReviewsUseCase makeNegativeReviewsUseCase() {
        return new NegativeMovieReviewsUseCase();
    }

    @Override
    public IPositiveMovieReviewsUseCase makePositiveMovieReviewsUseCase() {
        return new PositiveMovieReviewsUseCase();
    }

    @Override
    public IAllMovieReviewsUseCase makeAllMovieReviewsUseCase() {
        return new AllMovieReviewsUseCase();
    }

    @Override
    public IMoviePublishingUseCase makeMoviePublishingUseCase() {
        return new MoviePublishingUseCase();
    }

    @Override
    public IMovieReviewPublishingUseCase makeMovieReviewPublishingUseCase() {
        return new MovieReviewPublishingUseCase();
    }
}
