package repositories;

public interface RepositoryFactory {
    MoviesRepository connectToMoviesRepository();
    ReviewsRepository connectToReviewsRepository();
}
