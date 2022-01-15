package com.evilcorp.rottenfalafels.usecases;

public interface IUseCase<Req extends IUseCaseRequest, Res extends IUseCaseResponse> {
    Res process(Req request);
}
