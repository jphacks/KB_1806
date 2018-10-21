package com.mybossseasonfinal.justthejob.Services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\n\u001a\u00020\u0007H\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0003H\'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\'J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u0007H\'J\u001c\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\'J\u0012\u0010\u0017\u001a\u00020\u00142\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\'\u00a8\u0006\u001a"}, d2 = {"Lcom/mybossseasonfinal/justthejob/Services/ApiService;", "", "getAllCompany", "Lio/reactivex/Single;", "", "Lcom/mybossseasonfinal/justthejob/Models/Company;", "userId", "", "getBestMatchWorker", "Lcom/mybossseasonfinal/justthejob/Models/MatchingWorker;", "companyId", "workerId", "getCompany", "getUsers", "", "Lcom/mybossseasonfinal/justthejob/Models/User;", "getWorker", "Lcom/mybossseasonfinal/justthejob/Models/Worker;", "getWorkers", "postEntrySheet", "Lio/reactivex/Completable;", "content", "", "postUsersCompany", "usersCompany", "Lcom/mybossseasonfinal/justthejob/Models/UsersCompany;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "1cuu41x1")
    @retrofit2.http.Headers(value = {"Content-type: application/json"})
    public abstract io.reactivex.Single<java.util.List<com.mybossseasonfinal.justthejob.Models.User>> getUsers();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/users/personality")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Completable postEntrySheet(@retrofit2.http.Field(value = "user_id")
    int userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "content")
    java.lang.String content);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/company/{company_id}")
    public abstract io.reactivex.Single<com.mybossseasonfinal.justthejob.Models.Company> getCompany(@retrofit2.http.Path(value = "company_id")
    int companyId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/users/company")
    public abstract io.reactivex.Completable postUsersCompany(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.mybossseasonfinal.justthejob.Models.UsersCompany usersCompany);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users/{id}")
    public abstract io.reactivex.Single<java.util.List<com.mybossseasonfinal.justthejob.Models.Company>> getAllCompany(@retrofit2.http.Path(value = "id")
    int userId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/company/{id}/employees")
    public abstract io.reactivex.Single<java.util.List<com.mybossseasonfinal.justthejob.Models.Worker>> getWorkers(@retrofit2.http.Path(value = "id")
    int companyId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/company/{companyId}/employees/{workerId}")
    public abstract io.reactivex.Single<com.mybossseasonfinal.justthejob.Models.Worker> getWorker(@retrofit2.http.Path(value = "companyId")
    int companyId, @retrofit2.http.Path(value = "workerId")
    int workerId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users/{userId}/matching/{companyId}")
    public abstract io.reactivex.Single<com.mybossseasonfinal.justthejob.Models.MatchingWorker> getBestMatchWorker(@retrofit2.http.Path(value = "companyId")
    int companyId, @retrofit2.http.Path(value = "userId")
    int workerId);
}